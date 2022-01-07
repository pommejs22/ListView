package com.example.training2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class giMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // データ一覧の取得
        val luFfy = Onepiece(R.drawable.onepiece01_luffy2, "海賊王におれはなる！！！！", "モンキー・D・ルフィ")
        val zoRo = Onepiece(R.drawable.onepiece02_zoro_bandana, "背中の傷は剣士の恥だ", "ロロノア・ゾロ")
        val naMi = Onepiece(R.drawable.onepiece03_nami, "もう背中向けられないじゃないっ!!!!", "ナミ")
        val sanJi = Onepiece(R.drawable.onepiece05_sanji, ".....長い間!!!　くそお世話になりました!!!", "サンジ")
        val chopper = Onepiece(R.drawable.onepiece06_chopper, "世界で一番偉大な医者がくれた名前だ!!", "トニートニー・チョッパー")

        val memberList = mutableListOf<Onepiece>()
        // member をaddしていく



        val onePieceList = arrayListOf<Onepiece>()

        for (member in memberList){
            memberList.add(member)
        }


        for (i in 1..5) {
            onePieceList.add(Onepiece(0, "", "").apply {
                when (i) {
                    1 -> {
                        this.imageId = R.drawable.onepiece01_luffy2
                        this.title = "海賊王におれはなる！！！！"
                        this.name = "モンキー・D・ルフィ"
                    }
                    2 -> {
                        this.imageId = R.drawable.onepiece02_zoro_bandana
                        this.title = "背中の傷は剣士の恥だ"
                        this.name = "ロロノア・ゾロ"
                    }
                    3 -> {
                        this.imageId = R.drawable.onepiece03_nami
                        this.title = "もう背中向けられないじゃないっ!!!!"
                        this.name = "ナミ"
                    }
                    4 -> {
                        this.imageId = R.drawable.onepiece05_sanji
                        this.title = ".....長い間!!!　くそお世話になりました!!!"
                        this.name = "サンジ"
                    }
                    5 -> {
                        this.imageId = R.drawable.onepiece06_chopper
                        //this.imageId = "チョッパー"
                        this.title = "世界で一番偉大な医者がくれた名前だ!!"
                        this.name = "トニートニー・チョッパー"
                    }
                }

            })

            // ListViewのインスタンス生成
            val listView = findViewById<ListView>(R.id.custom_list_view)

            val adapter = CustomAdpter(this, onePieceList)
            listView.adapter = adapter


            //　ボタンクリックイベントリスナー設定
            listView.setOnItemClickListener { parent: AdapterView<*>, _: View, position: Int, _: Long ->

//            Toast.makeText(this@MainActivity,"猫",Toast.LENGTH_LONG).show()


                val item = parent.getItemAtPosition(position) as Onepiece
                val state = Onepiece(item.imageId, item.title, item.name)

                Intent(this@MainActivity, SubActivity::class.java).apply {
                    this.putExtra("onepiece", state)
                }.also { startActivity(it) }
                // 次の画面へ遷移
            }
        }
    }
}