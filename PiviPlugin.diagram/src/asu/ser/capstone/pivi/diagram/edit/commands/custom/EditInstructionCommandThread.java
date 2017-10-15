package asu.ser.capstone.pivi.diagram.edit.commands.custom;

import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionImpl;
import org.eclipse.jface.wizard.IWizard;

import asu.ser.capstone.pivi.diagram.part.custom.InstructionWizard;

public class EditInstructionCommandThread implements Runnable{
	
	private TransactionalEditingDomain domain;
	private EStructuralFeature feature;
	private EObject modelElement;
	private IWizard wizard;
	
	public EditInstructionCommandThread(TransactionalEditingDomain domain, EStructuralFeature feature, EObject modelElement, IWizard wizard) {
		this.domain = domain;
		this.feature = feature;
		this.modelElement = modelElement;
		this.wizard = wizard;
	}
	

	@Override
	public void run() {
		TransactionImpl transaction = new TransactionImpl(domain, false, Collections.EMPTY_MAP);
		try {
			transaction.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		org.eclipse.emf.common.command.Command command = SetCommand.create(domain, modelElement,
				feature, ((InstructionWizard) wizard).getNewInstructions());
		if (command.canExecute()) {
			command.execute();
		}
		try {
			transaction.commit();
		} catch (RollbackException exception_p) {
			exception_p.printStackTrace();
		}
	}

}
