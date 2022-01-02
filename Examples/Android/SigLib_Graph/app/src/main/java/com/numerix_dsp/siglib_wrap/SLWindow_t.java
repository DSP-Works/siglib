/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package siglib_wrap;

public final class SLWindow_t {
  public final static SLWindow_t SIGLIB_HANNING = new SLWindow_t("SIGLIB_HANNING");
  public final static SLWindow_t SIGLIB_HAMMING = new SLWindow_t("SIGLIB_HAMMING");
  public final static SLWindow_t SIGLIB_BLACKMAN = new SLWindow_t("SIGLIB_BLACKMAN");
  public final static SLWindow_t SIGLIB_BARTLETT_TRIANGLE_ZERO_END_POINTS = new SLWindow_t("SIGLIB_BARTLETT_TRIANGLE_ZERO_END_POINTS");
  public final static SLWindow_t SIGLIB_BARTLETT_TRIANGLE_NON_ZERO_END_POINTS = new SLWindow_t("SIGLIB_BARTLETT_TRIANGLE_NON_ZERO_END_POINTS");
  public final static SLWindow_t SIGLIB_KAISER = new SLWindow_t("SIGLIB_KAISER");
  public final static SLWindow_t SIGLIB_BLACKMAN_HARRIS = new SLWindow_t("SIGLIB_BLACKMAN_HARRIS");
  public final static SLWindow_t SIGLIB_RECTANGLE = new SLWindow_t("SIGLIB_RECTANGLE");
  public final static SLWindow_t SIGLIB_FLAT_TOP = new SLWindow_t("SIGLIB_FLAT_TOP");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static SLWindow_t swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + SLWindow_t.class + " with value " + swigValue);
  }

  private SLWindow_t(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private SLWindow_t(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private SLWindow_t(String swigName, SLWindow_t swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static SLWindow_t[] swigValues = { SIGLIB_HANNING, SIGLIB_HAMMING, SIGLIB_BLACKMAN, SIGLIB_BARTLETT_TRIANGLE_ZERO_END_POINTS, SIGLIB_BARTLETT_TRIANGLE_NON_ZERO_END_POINTS, SIGLIB_KAISER, SIGLIB_BLACKMAN_HARRIS, SIGLIB_RECTANGLE, SIGLIB_FLAT_TOP };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

