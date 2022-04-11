package com.example.ejemplocorrutinas1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var progressBar:ProgressBar = findViewById(R.id.progressBar)
        var txtUser:EditText = findViewById(R.id.txtUser)
        var txtPass:EditText = findViewById(R.id.txtPass)
        var btnLogin:Button = findViewById(R.id.btnLogin)


        btnLogin.setOnClickListener {
            var user:String = txtUser.text.toString()
            var pass:String = txtPass.text.toString()

            progressBar.visibility = View.VISIBLE
            var x:Boolean = validarUser(user, pass)
            progressBar.visibility = View.GONE
            if (x){
                Toast.makeText(applicationContext, "Válido", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(applicationContext, "Inválido", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun validarUser(user:String, pass:String):Boolean{
        Thread.sleep(3000)
        if(user == "admin" && pass == "123"){
            return true
        }
        return false
    }
}