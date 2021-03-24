package com.example.fastcampusandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calculator.*

var new = ""
var old = ""
var cal = ""
var result = ""

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)


        btn1.setOnClickListener{
            new += "1"
            formTxt.text = new
        }

        btn2.setOnClickListener{
            new += "2"
            formTxt.text = new
        }

        btn3.setOnClickListener{
            new += "3"
            formTxt.text = new
        }

        btn4.setOnClickListener{
            new += "4"
            formTxt.text = new
        }

        btn5.setOnClickListener{
            new += "5"
            formTxt.text = new
        }

        btn6.setOnClickListener{
            new += "6"
            formTxt.text = new
        }

        btn7.setOnClickListener{
            new += "7"
            formTxt.text = new
        }

        btn8.setOnClickListener{
            new += "8"
            formTxt.text = new
        }

        btn9.setOnClickListener{
            new += "9"
            formTxt.text = new
        }

        btn0.setOnClickListener{
            new += "0"
            formTxt.text = new
        }

        // 더하기버튼 클릭시
        addBtn.setOnClickListener{
            calEvent("+", new)
        }

        // 빼기버튼 클릭시
        subBtn.setOnClickListener{
           calEvent("-", new)
        }

        // 곱하기버튼 클릭시
        mulBtn.setOnClickListener{
            calEvent("*", new)
        }

        // 나누기 버튼 클릭시
        divBtn.setOnClickListener{
            calEvent("/", new)
        }

        // 초기화버튼 클릭시
        clearBtn.setOnClickListener{
            clearEvent()
        }

        // del버튼 클릭시
        delBtn.setOnClickListener{
                Log.d("TAG","new del 전 : $new" )
                if(new.isNotEmpty()){
                    new = new.substring(0, new.length-1)
                    formTxt.text = new
                }else{
                    Toast.makeText(this,"지울 값이 없습니다.",Toast.LENGTH_SHORT).show()
                    resultTxt.text = ""
                }

                Log.d("TAG","new del 후 : $new" )
        }

        // = 버튼 클릭시
        equalBtn.setOnClickListener{
            val newSplit = new.split(cal)
            new = newSplit[1]

            when (cal){
                "+"-> {
                    result = (old.toInt() + new.toInt()).toString()
                }
                "-"-> {
                    result = (old.toInt() - new.toInt()).toString()
                }
                "*"->{
                    result = (old.toInt() * new.toInt()).toString()
                }
                "/"->{
                    result = (old.toInt() / new.toInt()).toString()
                }
            }
            new = result
            resultTxt.text = result
        }
    }


    // clearBtn 클릭시 모든 입력값 초기
    private fun clearEvent(){
        formTxt.text = ""
        resultTxt.text = ""
        new = ""
        old = ""
    }

    private fun calEvent(valueCal : String, valueNew : String){
        new = if("" == valueNew){
            "0"
        }else{
            valueNew
        }
        val lastChar = new.substring(new.length-1)
        if(lastChar == "-" || lastChar == "+" || lastChar == "*" || lastChar == "/" ){
            new = new.substring(0,new.length-1)
        }
        old = new
        new += valueCal
        cal = valueCal
        formTxt.text = new
    }
}