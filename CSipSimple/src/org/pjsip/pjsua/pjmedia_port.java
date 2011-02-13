/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public class pjmedia_port {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public pjmedia_port(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(pjmedia_port obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
  }

  /** This constructor creates the proxy which initially does not create nor own any C memory */
  public pjmedia_port() {
    this(0, false);
  }

  public void setInfo(pjmedia_port_info value) {
    pjsuaJNI.pjmedia_port_info_set(swigCPtr, this, pjmedia_port_info.getCPtr(value), value);
  }

  public pjmedia_port_info getInfo() {
    long cPtr = pjsuaJNI.pjmedia_port_info_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pjmedia_port_info(cPtr, false);
  }

  public void setPut_frame(SWIGTYPE_p_f_p_pjmedia_port_p_pjmedia_frame__int value) {
    pjsuaJNI.pjmedia_port_put_frame_set(swigCPtr, this, SWIGTYPE_p_f_p_pjmedia_port_p_pjmedia_frame__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_pjmedia_port_p_pjmedia_frame__int getPut_frame() {
    long cPtr = pjsuaJNI.pjmedia_port_put_frame_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_pjmedia_port_p_pjmedia_frame__int(cPtr, false);
  }

  public void setGet_frame(SWIGTYPE_p_f_p_pjmedia_port_p_pjmedia_frame__int value) {
    pjsuaJNI.pjmedia_port_get_frame_set(swigCPtr, this, SWIGTYPE_p_f_p_pjmedia_port_p_pjmedia_frame__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_pjmedia_port_p_pjmedia_frame__int getGet_frame() {
    long cPtr = pjsuaJNI.pjmedia_port_get_frame_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_pjmedia_port_p_pjmedia_frame__int(cPtr, false);
  }

  public void setOn_destroy(SWIGTYPE_p_f_p_pjmedia_port__int value) {
    pjsuaJNI.pjmedia_port_on_destroy_set(swigCPtr, this, SWIGTYPE_p_f_p_pjmedia_port__int.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_pjmedia_port__int getOn_destroy() {
    long cPtr = pjsuaJNI.pjmedia_port_on_destroy_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_pjmedia_port__int(cPtr, false);
  }

}
