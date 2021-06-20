package com.mahmoudbashir.androidunittestingapplying

object RegisterationUtil {

    private val existingUsers = listOf("peter","carl")

    /*
   * the input is not valid if ..
   *  ... username / password is Empty
   * ... username is already taken
   * ...  confirmed password is not the same as real password
   * ... password contains less than 2 digits
   *
   */

    fun validateRegisterationInput(
        username:String,
        password:String,
        confirmedpassword:String
    ):Boolean{
       if(username.isEmpty() || password.isEmpty()){
           return false
       }
        if (username in existingUsers){
            return false
        }
        if (password != confirmedpassword){
            return false
        }

        if (password.count{it.isDigit()} <2){
            return false
        }
        return true
    }
}