package com.example.furusatoup.myownflashcards

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        ボタンのクリック処理
//        「単語を編集」ボタンを押した場合
//        単語一覧画面へ
        buttonEdit.setOnClickListener {
            val intent = Intent(this@MainActivity, WordListActivity::class.java)
            startActivity(intent)
        }

//        「色」ボタンを押した場合
//        画面の背景色をボタンの色に変更
<<<<<<< HEAD
        var intBackGroundColor = 0
        buttonColor01.setOnClickListener {
            intBackGroundColor = R.color.color01
            constraintLaioutMain.setBackgroundResource(intBackGroundColor)
        }
        buttonColor02.setOnClickListener {
            intBackGroundColor = R.color.color02
            constraintLaioutMain.setBackgroundResource(intBackGroundColor)
        }
        buttonColor03.setOnClickListener {
            intBackGroundColor = R.color.color03
            constraintLaioutMain.setBackgroundResource(intBackGroundColor)
        }
        buttonColor04.setOnClickListener {
            intBackGroundColor = R.color.color04
            constraintLaioutMain.setBackgroundResource(intBackGroundColor)
        }
        buttonColor05.setOnClickListener {
            intBackGroundColor = R.color.color05
            constraintLaioutMain.setBackgroundResource(intBackGroundColor)
        }
        buttonColor06.setOnClickListener {
            intBackGroundColor = R.color.color06
            constraintLaioutMain.setBackgroundResource(intBackGroundColor)
        }
=======
        buttonColor01.setOnClickListener {  }
        buttonColor02.setOnClickListener {  }
        buttonColor03.setOnClickListener {  }
        buttonColor04.setOnClickListener {  }
        buttonColor05.setOnClickListener {  }
        buttonColor06.setOnClickListener {  }
>>>>>>> 2eba7c3eb64756c46d57773bac05bac8084e1959
    }
}
