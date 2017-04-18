package CodeBlockMM.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ConnectionEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4001;

	/**
	* @generated
	*/
	public ConnectionEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CodeBlockMM.diagram.edit.policies.ConnectionItemSemanticEditPolicy());
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/

	protected Connection createConnectionFigure() {
		return new ConnectionFigure();
	}

	/**
	* @generated
	*/
	public ConnectionFigure getPrimaryShape() {
		return (ConnectionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ConnectionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureConnectionNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureConnectionCodeFigure;

		/**
		 * @generated
		 */
		public ConnectionFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureConnectionNameFigure = new WrappingLabel();

			fFigureConnectionNameFigure.setText("<...>");

			this.add(fFigureConnectionNameFigure);

			fFigureConnectionCodeFigure = new WrappingLabel();

			fFigureConnectionCodeFigure.setText("<...>");

			this.add(fFigureConnectionCodeFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureConnectionNameFigure() {
			return fFigureConnectionNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureConnectionCodeFigure() {
			return fFigureConnectionCodeFigure;
		}

	}

}
