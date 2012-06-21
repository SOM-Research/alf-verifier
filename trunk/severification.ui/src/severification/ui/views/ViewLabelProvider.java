package severification.ui.views;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import severification.ui.views.ViewContentProvider.TREE_OBJ_TYPE;

class ViewLabelProvider extends LabelProvider {

	public String getText(Object obj) {
		return obj.toString();
	}
	public Image getImage(Object obj) {
		String imageKey = ISharedImages.IMG_TOOL_FORWARD;
		if (obj instanceof TreeParent){
			TreeParent treeParent = (TreeParent) obj;
			if ( treeParent.getType() != TREE_OBJ_TYPE.TEXT ){
				if ( treeParent.isSE() ){
					imageKey = ISharedImages.IMG_OBJS_TASK_TSK;
				} else {
					imageKey = ISharedImages.IMG_TOOL_DELETE;
				}
				if ( treeParent.getType() == TREE_OBJ_TYPE.QUERY ){
					imageKey = ISharedImages.IMG_OBJS_WARN_TSK;
				}
			}
		} else if ( obj instanceof TreeObject ){
			imageKey = null;
		}

		return PlatformUI.getWorkbench().getSharedImages().getImage(imageKey);
	}
}