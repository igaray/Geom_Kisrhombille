package org.fleen.geom_Kisrhombille;

import java.io.Serializable;

/*
 * turns a metagon into a polygon
 * these are the concrete params that fleshize the abstraction
 * used for jigs
 */
public class KAnchor implements Serializable{
  
  private static final long serialVersionUID=-5677563038771003335L;

  /*
   * ################################
   * CONSTRUCTOR
   * ################################
   */
  
  public KAnchor(KVertex v0,KVertex v1,boolean twist){
    this.v0=v0;
    this.v1=v1;
    this.twist=twist;}
  
  /*
   * ################################
   * GEOMETRY
   * ################################
   */
  
  public KVertex v0,v1;
  public boolean twist;
  
  /*
   * ################################
   * OBJECT
   * ################################
   */

  public boolean equals(Object a){
    KAnchor b=(KAnchor)a;
    return b.v0.equals(v0)&&b.v1.equals(v1)&&b.twist==twist;}
  
  public String toString(){
    return "["+getClass().getSimpleName()+" v0="+v0+" v1="+v1+" twist="+twist+"]";}
  
}