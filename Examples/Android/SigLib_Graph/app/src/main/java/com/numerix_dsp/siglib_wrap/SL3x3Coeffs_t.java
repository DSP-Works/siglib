/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package siglib_wrap;

public final class SL3x3Coeffs_t {
  public final static SL3x3Coeffs_t SIGLIB_EDGE_ENHANCEMENT = new SL3x3Coeffs_t("SIGLIB_EDGE_ENHANCEMENT");
  public final static SL3x3Coeffs_t SIGLIB_HORIZONTAL_EDGE = new SL3x3Coeffs_t("SIGLIB_HORIZONTAL_EDGE");
  public final static SL3x3Coeffs_t SIGLIB_VERTICAL_EDGE = new SL3x3Coeffs_t("SIGLIB_VERTICAL_EDGE");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static SL3x3Coeffs_t swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + SL3x3Coeffs_t.class + " with value " + swigValue);
  }

  private SL3x3Coeffs_t(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private SL3x3Coeffs_t(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private SL3x3Coeffs_t(String swigName, SL3x3Coeffs_t swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static SL3x3Coeffs_t[] swigValues = { SIGLIB_EDGE_ENHANCEMENT, SIGLIB_HORIZONTAL_EDGE, SIGLIB_VERTICAL_EDGE };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

