
/// class java.awt.dnd.DragSourceAdapter ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class DragSourceAdapterProxy extends java.awt.dnd.DragSourceAdapter {

    long __swiftObject;

    /// public java.awt.dnd.DragSourceAdapter()

    DragSourceAdapterProxy( long __swiftObject ) {
        super( );
        this.__swiftObject = __swiftObject;
    }

    /// public void java.awt.dnd.DragSourceAdapter.dragDropEnd(java.awt.dnd.DragSourceDropEvent)

    public native void __dragDropEnd( long __swiftObject, java.awt.dnd.DragSourceDropEvent dsde );

    boolean entered_dragDropEnd_0;

    public void dragDropEnd( java.awt.dnd.DragSourceDropEvent dsde ) {
        if ( !entered_dragDropEnd_0 ) {
            entered_dragDropEnd_0 = true;
            __dragDropEnd( __swiftObject, dsde);
            entered_dragDropEnd_0 = false;
        }
        else
            super.dragDropEnd( dsde );
    }

    /// public void java.awt.dnd.DragSourceAdapter.dragMouseMoved(java.awt.dnd.DragSourceDragEvent)

    public native void __dragMouseMoved( long __swiftObject, java.awt.dnd.DragSourceDragEvent dsde );

    boolean entered_dragMouseMoved_1;

    public void dragMouseMoved( java.awt.dnd.DragSourceDragEvent dsde ) {
        if ( !entered_dragMouseMoved_1 ) {
            entered_dragMouseMoved_1 = true;
            __dragMouseMoved( __swiftObject, dsde);
            entered_dragMouseMoved_1 = false;
        }
        else
            super.dragMouseMoved( dsde );
    }

    /// public void java.awt.dnd.DragSourceAdapter.dragEnter(java.awt.dnd.DragSourceDragEvent)

    public native void __dragEnter( long __swiftObject, java.awt.dnd.DragSourceDragEvent dsde );

    boolean entered_dragEnter_2;

    public void dragEnter( java.awt.dnd.DragSourceDragEvent dsde ) {
        if ( !entered_dragEnter_2 ) {
            entered_dragEnter_2 = true;
            __dragEnter( __swiftObject, dsde);
            entered_dragEnter_2 = false;
        }
        else
            super.dragEnter( dsde );
    }

    /// public void java.awt.dnd.DragSourceAdapter.dragOver(java.awt.dnd.DragSourceDragEvent)

    public native void __dragOver( long __swiftObject, java.awt.dnd.DragSourceDragEvent dsde );

    boolean entered_dragOver_3;

    public void dragOver( java.awt.dnd.DragSourceDragEvent dsde ) {
        if ( !entered_dragOver_3 ) {
            entered_dragOver_3 = true;
            __dragOver( __swiftObject, dsde);
            entered_dragOver_3 = false;
        }
        else
            super.dragOver( dsde );
    }

    /// public void java.awt.dnd.DragSourceAdapter.dropActionChanged(java.awt.dnd.DragSourceDragEvent)

    public native void __dropActionChanged( long __swiftObject, java.awt.dnd.DragSourceDragEvent dsde );

    boolean entered_dropActionChanged_4;

    public void dropActionChanged( java.awt.dnd.DragSourceDragEvent dsde ) {
        if ( !entered_dropActionChanged_4 ) {
            entered_dropActionChanged_4 = true;
            __dropActionChanged( __swiftObject, dsde);
            entered_dropActionChanged_4 = false;
        }
        else
            super.dropActionChanged( dsde );
    }

    /// public void java.awt.dnd.DragSourceAdapter.dragExit(java.awt.dnd.DragSourceEvent)

    public native void __dragExit( long __swiftObject, java.awt.dnd.DragSourceEvent dse );

    boolean entered_dragExit_5;

    public void dragExit( java.awt.dnd.DragSourceEvent dse ) {
        if ( !entered_dragExit_5 ) {
            entered_dragExit_5 = true;
            __dragExit( __swiftObject, dse);
            entered_dragExit_5 = false;
        }
        else
            super.dragExit( dse );
    }

    /// public boolean java.lang.Object.equals(java.lang.Object)

    public native boolean __equals( long __swiftObject, java.lang.Object arg0 );

    boolean entered_equals_6;

    public boolean equals( java.lang.Object arg0 ) {
        if ( !entered_equals_6 ) {
            entered_equals_6 = true;
            boolean __return = __equals( __swiftObject, arg0);
            entered_equals_6 = false;
            return __return;
        }
        else
            return super.equals( arg0 );
    }

    /// public java.lang.String java.lang.Object.toString()

    public native java.lang.String __toString( long __swiftObject );

    boolean entered_toString_7;

    public java.lang.String toString() {
        if ( !entered_toString_7 ) {
            entered_toString_7 = true;
            java.lang.String __return = __toString( __swiftObject );
            entered_toString_7 = false;
            return __return;
        }
        else
            return super.toString( );
    }

    /// public native int java.lang.Object.hashCode()

    public native int __hashCode( long __swiftObject );

    boolean entered_hashCode_8;

    public int hashCode() {
        if ( !entered_hashCode_8 ) {
            entered_hashCode_8 = true;
            int __return = __hashCode( __swiftObject );
            entered_hashCode_8 = false;
            return __return;
        }
        else
            return super.hashCode( );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
