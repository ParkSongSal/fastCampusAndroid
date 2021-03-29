package com.example.fastcampusandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calculator.*
import java.text.DecimalFormat

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
            formTxt.text = commaFormat(new)
        }

        btn2.setOnClickListener{
            new += "2"
            formTxt.text = commaFormat(new)
        }

        btn3.setOnClickListener{
            new += "3"
            formTxt.text = commaFormat(new)
        }

        btn4.setOnClickListener{
            new += "4"
            formTxt.text = commaFormat(new)
        }

        btn5.setOnClickListener{
            new += "5"
            formTxt.text = commaFormat(new)
        }

        btn6.setOnClickListener{
            new += "6"
            formTxt.text = commaFormat(new)
        }

        btn7.setOnClickListener{
            new += "7"
            formTxt.text = commaFormat(new)
        }

        btn8.setOnClickListener{
            new += "8"
            formTxt.text = commaFormat(new)
        }

        btn9.setOnClickListener{
            new += "9"
            formTxt.text = commaFormat(new)
        }

        btn0.setOnClickListener{
            new += "0"
            formTxt.text = commaFormat(new)
        }

        // 더하기버튼 클릭시
        addBtn.setOnClickListener{
            calEvent("+", commaFormat(new))
        }

        // 빼기버튼 클릭시
        subBtn.setOnClickListener{
           calEvent("-", commaFormat(new))
        }

        // 곱하기버튼 클릭시
        mulBtn.setOnClickListener{
            calEvent("*", commaFormat(new))
        }

        // 나누기 버튼 클릭시
        divBtn.setOnClickListener{
            calEvent("/", commaFormat(new))
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
                    formTxt.text = commaFormat(new)
                }else{
                    Toast.makeText(this,"지울 값이 없습니다.",Toast.LENGTH_SHORT).show()
                    resultTxt.text = ""
                }

                Log.d("TAG","new del 후 : $new" )
        }

        // = 버튼 클릭시
        equalBtn.setOnClickListener{
//            val newSplit = new.split(cal)
//            new = newSplit[1]
            val oldSplit = old.split(cal)
            Log.d("TAG", "equal : ${oldSplit.toString()}")
            old = oldSplit[0].replace(",","")

            Log.d("TAG", "equal old : $old")
            Log.d("TAG", "equal new : $new")

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
            formTxt.text = commaFormat(old) + cal + commaFormat(new) + "="
            new = result
            resultTxt.text = commaFormat(result)
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
        //old = new
        //new += valueCal
        old = new + valueCal
        cal = valueCal
        Log.d("TAG","calEvent old : $old")
        new = ""
        Log.d("TAG","calEvent new : $new")
        //formTxt.text = new
        formTxt.text = old
    }

    // 천단위 콤마 (#,###)
    private fun commaFormat(value : String) : String{
        var result = ""
        val fomatter = DecimalFormat("###,###.##")
        result = fomatter.format(value.toLong())

        return result
    }
}