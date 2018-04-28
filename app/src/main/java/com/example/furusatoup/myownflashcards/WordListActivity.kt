package com.example.furusatoup.myownflashcards

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_word_list.*

class WordListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word_list)

//        前画面で設定した背景色を設定
        constraintLaioutWordlist.setBackgroundResource(intBackGroundColor)
//新しい単語を追加ボタンを押した場合EditActivityへ
        buttonAddNewWord.setOnClickListener {
            val intent = Intent(this@WordListActivity, EditActivity::class.java)
            intent.putExtra(getString(R.string.intent_key_status),getString(R.string.status_add))
            startActivity(intent)
        }
//        戻るボタンを押した場合
        buttonBack.setOnClickListener {
            finish()
        }
    }
}
