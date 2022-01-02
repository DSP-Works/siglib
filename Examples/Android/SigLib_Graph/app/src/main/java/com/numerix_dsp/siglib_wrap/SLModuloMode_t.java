/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package siglib_wrap;

public final class SLModuloMode_t {
  public final static SLModuloMode_t SIGLIB_SINGLE_SIDED_MODULO = new SLModuloMode_t("SIGLIB_SINGLE_SIDED_MODULO");
  public final static SLModuloMode_t SIGLIB_DOUBLE_SIDED_MODULO = new SLModuloMode_t("SIGLIB_DOUBLE_SIDED_MODULO");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static SLModuloMode_t swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + SLModuloMode_t.class + " with value " + swigValue);
  }

  private SLModuloMode_t(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private SLModuloMode_t(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private SLModuloMode_t(String swigName, SLModuloMode_t swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static SLModuloMode_t[] swigValues = { SIGLIB_SINGLE_SIDED_MODULO, SIGLIB_DOUBLE_SIDED_MODULO };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

