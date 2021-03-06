#include <jni.h>

/* Header for class math_CMath */

#ifndef _Included_math_CMath
#define _Included_math_CMath
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     math_CMath
 * Method:    plus
 * Signature: (DD)D
 */
JNIEXPORT jdouble JNICALL Java_math_CMath_plus
  (JNIEnv *, jobject, jdouble, jdouble);

/*
 * Class:     math_CMath
 * Method:    minus
 * Signature: (DD)D
 */
JNIEXPORT jdouble JNICALL Java_math_CMath_minus
  (JNIEnv *, jobject, jdouble, jdouble);

/*
 * Class:     math_CMath
 * Method:    mult
 * Signature: (DD)D
 */
JNIEXPORT jdouble JNICALL Java_math_CMath_mult
  (JNIEnv *, jobject, jdouble, jdouble);

/*
 * Class:     math_CMath
 * Method:    div
 * Signature: (DD)D
 */
JNIEXPORT jdouble JNICALL Java_math_CMath_div
  (JNIEnv *, jobject, jdouble, jdouble);

#ifdef __cplusplus
}
#endif
#endif
