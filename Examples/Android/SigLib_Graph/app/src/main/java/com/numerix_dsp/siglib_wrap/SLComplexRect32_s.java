/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package siglib_wrap;

public class SLComplexRect32_s {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SLComplexRect32_s(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SLComplexRect32_s obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        siglib_wrapJNI.delete_SLComplexRect32_s(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setReal(int value) {
    siglib_wrapJNI.SLComplexRect32_s_real_set(swigCPtr, this, value);
  }

  public int getReal() {
    return siglib_wrapJNI.SLComplexRect32_s_real_get(swigCPtr, this);
  }

  public void setImag(int value) {
    siglib_wrapJNI.SLComplexRect32_s_imag_set(swigCPtr, this, value);
  }

  public int getImag() {
    return siglib_wrapJNI.SLComplexRect32_s_imag_get(swigCPtr, this);
  }

  public SLComplexRect32_s() {
    this(siglib_wrapJNI.new_SLComplexRect32_s(), true);
  }

}
