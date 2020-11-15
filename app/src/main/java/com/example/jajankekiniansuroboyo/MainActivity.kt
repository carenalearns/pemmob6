package com.example.jajankekiniansuroboyo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savediInstanceState: Bundle?) {
        super.onCreate(savediInstanceState)
        setContentView(R.layout.activity_main)
        val testData = createJajanData()
        rv_parts.layoutManager = LinearLayoutManager(this)
        rv_parts.setHasFixedSize(true)
        rv_parts.adapter =
            ContactAdapter(testData, { jajanItem: JajanData -> jajanItemClicked(jajanItem) })
    }

    private fun jajanItemClicked(jajanItem: JajanData) {
        val showDetailActivityIntent = Intent(this, JajanDetailActivity::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, jajanItem.imgj)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, jajanItem.nama)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, jajanItem.deskripsi)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, jajanItem.harga)
        startActivity(showDetailActivityIntent)
    }

    private fun createJajanData(): List<JajanData> {
        val partList = ArrayList<JajanData>()
        partList.add(JajanData(R.drawable.imges ,"Es Gabus", "Es gabus adalah makanan yang dibuat dari tepung sagu yang direbus dengan santan dan dibekukan di kulkas. Setelah beku, makanan tersebut diberi warna pelangi. Es tersebut kemudian dihidangkan dengan coklat cair atau topping lainnya.", "Rp 2.000/potong"))
        partList.add(JajanData(R.drawable.imgtahu ,"Tahu Walik", "Tahu walik sendiri merupakan camilan khas dari Banyuwangi, Jawa Timur. Tahu walik biasanya digoreng dengan isian aci atau pun bahan lain di dalamnya. Diberi nama walik karena cara mengolahnya adalah tahunya dibalik terlebih dulu. Kini tahu walik populer di berbagai wilayah lainnya salah satunya Surabaya.", "Rp 2.000/buah"))
        partList.add(JajanData(R.drawable.imgkue ,"Kue Balok", "Kue balok sesuai dengan namanya berbentuki balok. Kue ini memiliki tekstur yang padat, rasanya manis, membuat siapapun suka untuk menikmati kue balok. Proses pembuatannya yaitu dengan cara dibakar bagian atas dan bawah. Saat ini banyak sekali varian rasa kue balok, mulai dari coklat, keju, selai hingga rasa lainnya.", "Rp 3.000/buah"))
        partList.add(JajanData(R.drawable.imgpisang ,"Pisang Meler", "Sebenarnya pisang meler ini tidak jauh beda dengan piscok. Komposisi dari pisang meler ini terdiri dari lumpia yang diisi dengan pisang, keju dan coklat. Hanya saja coklat yang terkandung dalam piscok yang biasa digunakan adalah meses sekarang di pisang meler diganti dengan selai coklat yang berlimpah, dan ketika digigit coklat yang berlimpah itu terasa meleleh dimulut.", "Rp 2.000/buah"))
        partList.add(JajanData(R.drawable.imgroti ,"Roti Goreng", "Roti Goreng dikenal sebagai jajanan tradisional khas Bandung, Jawa Barat. Jajanan tersebut berupa adonan roti dari terigu yang digoreng. Roti Goreng memiliki rasa yang manis dengan tekstur yang empuk. Paling enak disantap bersama dengan kopi atau teh. Selain disebut odading, roti goreng juga memiliki nama sebutan lainnya, yaitu roti bantal.", "Rp 2.000/buah"))
        partList.add(JajanData(R.drawable.imgtakoyaki ,"Takoyaki", "Takoyaki adalah nama makanan asal daerah Kansai di Jepang, berbentuk bola-bola kecil dengan diameter 3-5 cm yang dibuat dari adonan tepung terigu diisi potongan gurita di dalamnya. Takoyaki biasanya dijual sebagai jajanan di pinggir jalan untuk dinikmati sebagai camilan. Takoyaki biasa dijual dalam bentuk set dengan 1 set berisi 5 buah takoyaki yang disajikan di atas lembaran plastik berbentuk perahu atau dimasukkan ke dalam kemasan plastik/kertas untuk dibawa pulang.", "Rp 15.000/set"))
        return partList
    }
}