/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package siglib_wrap;

public class SLMicrophone32_s {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SLMicrophone32_s(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SLMicrophone32_s obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        siglib_wrapJNI.delete_SLMicrophone32_s(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setXPos(int value) {
    siglib_wrapJNI.SLMicrophone32_s_xPos_set(swigCPtr, this, value);
  }

  public int getXPos() {
    return siglib_wrapJNI.SLMicrophone32_s_xPos_get(swigCPtr, this);
  }

  public void setYPos(int value) {
    siglib_wrapJNI.SLMicrophone32_s_yPos_set(swigCPtr, this, value);
  }

  public int getYPos() {
    return siglib_wrapJNI.SLMicrophone32_s_yPos_get(swigCPtr, this);
  }

  public void setDelay(int value) {
    siglib_wrapJNI.SLMicrophone32_s_delay_set(swigCPtr, this, value);
  }

  public int getDelay() {
    return siglib_wrapJNI.SLMicrophone32_s_delay_get(swigCPtr, this);
  }

  public void setGain(int value) {
    siglib_wrapJNI.SLMicrophone32_s_gain_set(swigCPtr, this, value);
  }

  public int getGain() {
    return siglib_wrapJNI.SLMicrophone32_s_gain_get(swigCPtr, this);
  }

  public SLMicrophone32_s() {
    this(siglib_wrapJNI.new_SLMicrophone32_s(), true);
  }

}
