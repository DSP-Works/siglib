/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package siglib_wrap;

public final class SLEcho_t {
  public final static SLEcho_t SIGLIB_ECHO = new SLEcho_t("SIGLIB_ECHO");
  public final static SLEcho_t SIGLIB_REVERB = new SLEcho_t("SIGLIB_REVERB");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static SLEcho_t swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + SLEcho_t.class + " with value " + swigValue);
  }

  private SLEcho_t(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private SLEcho_t(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private SLEcho_t(String swigName, SLEcho_t swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static SLEcho_t[] swigValues = { SIGLIB_ECHO, SIGLIB_REVERB };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

