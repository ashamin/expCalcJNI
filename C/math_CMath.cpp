/*
 * +math_CMath.cpp
 *
 *  Created on: 29.12.2012
 *      Author: Anton Shamin
 */

#include "math_CMath.h"

JNIEXPORT jdouble JNICALL Java_math_CMath_plus 
  (JNIEnv *env, jobject obj, jdouble par1, jdouble par2)
 {
	return par1 + par2;
 }

JNIEXPORT jdouble JNICALL Java_math_CMath_minus
  (JNIEnv *env, jobject obj, jdouble par1, jdouble par2)
 {
	return par1 - par2;
 }

JNIEXPORT jdouble JNICALL Java_math_CMath_mult
 (JNIEnv *env, jobject obj, jdouble par1, jdouble par2)
 {
  	return par1 * par2;
 }

JNIEXPORT jdouble JNICALL Java_math_CMath_div
  (JNIEnv *env, jobject obj, jdouble par1, jdouble par2)
 {
   	return par1 / par2;
 }

