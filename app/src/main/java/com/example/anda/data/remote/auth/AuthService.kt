//package com.example.anda.data.remote.auth
//
//import android.util.Log
//import com.example.anda.ApplicationClass.Companion.TAG
//import com.example.anda.ApplicationClass.Companion.retrofit
//import com.example.anda.data.entities.User
//import com.example.anda.ui.login.LoginView
//import com.example.anda.ui.siginup.SignUpView
//import com.example.anda.ui.splash.SplashView
//import retrofit2.Call
//import retrofit2.Callback
//import retrofit2.Response
//
//object AuthService {
//    fun signUp(signUpView: SignUpView, user: User) {
//
//        val authService = retrofit.create(AuthRetrofitInterface::class.java)
//
//        signUpView.onSignUpLoading()
//
//        authService.signUp(user).enqueue(object : Callback<AuthResponse> {
//            override fun onResponse(call: Call<AuthResponse>, response: Response<AuthResponse>) {
//                val resp = response.body()!!
//                Log.d("$TAG/RESP-SIGNUP", "뭐가 문제야")
//                when(resp.code){
//                    1000 -> signUpView.onSignUpSuccess()
//                    2001 -> signUpView.onSignUpFailure(resp.code, resp.message)
//                    2002 -> signUpView.onSignUpFailure(resp.code, resp.message)
//                    2003 -> signUpView.onSignUpFailure(resp.code, resp.message)
//                    2004 -> signUpView.onSignUpFailure(resp.code, resp.message)
//                    2005 -> signUpView.onSignUpFailure(resp.code, resp.message)
//                    else -> signUpView.onSignUpFailure(resp.code, resp.message)
//                }
//            }
//
//            override fun onFailure(call: Call<AuthResponse>, t: Throwable) {
//                Log.d("$TAG/API-ERROR", t.message.toString())
//
//                signUpView.onSignUpFailure(400, "네트워크 오류가 발생했습니다.")
//            }
//        })
//    }
//
//    fun login(loginView: LoginView, user: User) {
//        val authService = retrofit.create(AuthRetrofitInterface::class.java)
//
//        loginView.onLoginLoading()
//
//        authService.login(user).enqueue(object : Callback<AuthResponse> {
//            override fun onResponse(call: Call<AuthResponse>, response: Response<AuthResponse>) {
//                val resp = response.body()!!
//
//
//                when(val code = resp.code){
//                    1000 -> loginView.onLoginSuccess(code, resp.result!!)
//
//                    else -> loginView.onLoginFailure(resp.code, resp.message)
//                }
//            }
//
//            override fun onFailure(call: Call<AuthResponse>, t: Throwable) {
//                Log.d("$TAG/API-ERROR", t.message.toString())
//
//                loginView.onLoginFailure(400, "네트워크 오류가 발생했습니다.")
//            }
//        })
//    }
//
//    fun autoLogin(splashView: SplashView) {
//        val authService = retrofit.create(AuthRetrofitInterface::class.java)
//        splashView.onAutoLoginLoading()
//        authService.autoLogin().enqueue(object : Callback<AuthResponse> {
//            override fun onResponse(call: Call<AuthResponse>, response: Response<AuthResponse>) {
//                val resp = response.body()!!
//                when(resp.code){
//                    1000 -> splashView.onAutoLoginSuccess()
//                    else -> splashView.onAutoLoginFailure(resp.code, resp.message)
//                }
//            }
//            override fun onFailure(call: Call<AuthResponse>, t: Throwable) {
//                Log.d("$TAG/API-ERROR", t.message.toString())
//
//                splashView.onAutoLoginFailure(400, "네트워크 오류가 발생했습니다.")
//            }
//        })
//    }
//
//
//
//}