package id.wain.catatan.activity.login

import id.wain.catatan.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}