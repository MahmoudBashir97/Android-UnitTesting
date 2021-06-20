package com.mahmoudbashir.androidunittestingapplying

import com.google.common.truth.Truth
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegisterationUtilTest{

    @Test
    fun `empty username return false`(){
        val result =  RegisterationUtil.validateRegisterationInput(
            "","123","123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`(){
        val result =  RegisterationUtil.validateRegisterationInput(
            "Philip","123","123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`(){
        val result =  RegisterationUtil.validateRegisterationInput(
            "carl","123","123"
        )
        assertThat(result).isFalse()
    }


    // password was repeated incorrectly
    @Test
    fun `incorrectly confirmed password returns false`(){
        val result = RegisterationUtil.validateRegisterationInput(
            "philip",
            "123",
            "anfs16"
        )
        assertThat(result).isFalse()
    }
    // password contains less than 2 digits
    @Test
    fun `less than 2 digits password returns false`(){
        val result = RegisterationUtil.validateRegisterationInput(
            "philip",
            "abcd5g",
            "abcd5g"
        )
        assertThat(result).isFalse()
    }
    // empty password
    @Test
    fun `empty password returns false`(){
        val result = RegisterationUtil.validateRegisterationInput(
            "philip",
            "",
            ""
        )
        assertThat(result).isFalse()
    }
}