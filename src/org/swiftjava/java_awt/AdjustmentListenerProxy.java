
/// interface java.awt.event.AdjustmentListener ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class AdjustmentListenerProxy implements java.awt.event.AdjustmentListener {

    long __swiftObject;

    AdjustmentListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void java.awt.event.AdjustmentListener.adjustmentValueChanged(java.awt.event.AdjustmentEvent)

    public native void __adjustmentValueChanged( long __swiftObject, java.awt.event.AdjustmentEvent e );

    public void adjustmentValueChanged( java.awt.event.AdjustmentEvent e ) {
        __adjustmentValueChanged( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}