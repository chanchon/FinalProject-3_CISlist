package th.ac.kku.cis.mobileapp.cislist


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import th.ac.kku.cis.mobileapp.cislist.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var userArrayList: ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val imageId = intArrayOf(

            R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h
            ,R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,R.drawable.m,R.drawable.n,R.drawable.o,R.drawable.p
            ,R.drawable.q,R.drawable.r

        )

        val name = arrayListOf(

            "นายเจษฎาพร แสงสีงาม",
            "นายชาญชล บุบปับพา",
            "นางสาวทิชาพร ลีดี",
            "นายปัญจพล อ่อนโคทา",
            "นางสาวพรรณนิภา ผลเจริญ",
            "นายพุฒิพงศ์ สักแสน",
            "นายภาณุพงษ์ สุขส่ง",
            "นางสาวณัฏฐา ซ้อนศรี",
            "นายธนวัต คูโพนทอง",
            "นายธนากร ภิรมย์ไชย",
            "นางสาวภัณฑิรา แสนเรียน",
            "นางสาวอภิสรา ทองสังข์",
            "นายอลงกรณ์ ประดิษฐวงษ์",
            "นางสาวชลธิชา ธุระทำ",
            "นายณัฐดนัย วินทะไชย",
            "นายเอื้ออังกูร สร้อยอุดม",
            "นายชัชชพล กิจทวีวาณิช",
            "นางสาวเนตรนภา ทะอ่าง"
        )

        val  StudentID = arrayListOf(

            "623410003-8",
            "623410004-6",
            "623410005-4",
            "623410006-2",
            "623410007-0",
            "623410008-8",
            "623410009-6",
            "623410032-1",
            "623410033-9",
            "623410034-7",
            "623410035-5",
            "623410036-3",
            "623410037-1",
            "623410048-6",
            "623410049-4",
            "623410059-1",
            "623410060-6",
            "623410069-8"
        )

        val no_class = arrayListOf(

            "ปี 3",
            "ปี 3",
            "ปี 3",
            "ปี 3",
            "ปี 3",
            "ปี 3",
            "ปี 3",
            "ปี 3",
            "ปี 3",
            "ปี 3",
            "ปี 3",
            "ปี 3",
            "ปี 3",
            "ปี 3",
            "ปี 3",
            "ปี 3",
            "ปี 3",
            "ปี 3"
        )

        val phoneNo = arrayListOf(

            "061-6341757",
            "062-1319253",
            "082-6052476",
            "062-6195887",
            "064-7162527",
            "064-3469907",
            "061-0953083",
            "062-1973848",
            "088-0637398",
            "082-5321271",
            "090-9495510",
            "094-2905354",
            "093-7631801",
            "099-9999999",
            "098-2221587",
            "064-2806995",
            "088-4444444",
            "062-1372327"

        )

        val country = arrayListOf(


            "ร้อยเอ็ด",
            "มหาสารคาม",
            "ชัยภูมิ",
            "กาฬสินธุ์",
            "อุดรธานี",
            "กาฬสินธุ์",
            "นครพนม",
            "สุรินทร์",
            "หนองคาย",
            "ชัยภูมิ",
            "ขอนแก่น",
            "ศรีสะเกษ",
            "บุรีรัมย์",
            "ขอนแก่น",
            "หนองบัวลำภู",
            "ชัยภูมิ",
            "นครราชสีมา",
            "หนองคาย"
        )

        val university = arrayListOf(

            "มหาวิทยาลัยขอนแก่น",
            "มหาวิทยาลัยขอนแก่น",
            "มหาวิทยาลัยขอนแก่น",
            "มหาวิทยาลัยขอนแก่น",
            "มหาวิทยาลัยขอนแก่น",
            "มหาวิทยาลัยขอนแก่น",
            "มหาวิทยาลัยขอนแก่น",
            "มหาวิทยาลัยขอนแก่น",
            "มหาวิทยาลัยขอนแก่น",
            "มหาวิทยาลัยขอนแก่น",
            "มหาวิทยาลัยขอนแก่น",
            "มหาวิทยาลัยขอนแก่น",
            "มหาวิทยาลัยขอนแก่น",
            "มหาวิทยาลัยขอนแก่น",
            "มหาวิทยาลัยขอนแก่น",
            "มหาวิทยาลัยขอนแก่น",
            "มหาวิทยาลัยขอนแก่น",
            "มหาวิทยาลัยขอนแก่น"

        )

        val advisor = arrayListOf(


            "ผศ.ดร.นงราม เหมือนฤทธิ์",
            "รศ.ดร.ชญาดา สุระวนิชกุล",
            "รศ.ดร.ชญาดา สุระวนิชกุล",
            "ผศ.ดร.พรรณรัตน์ ก้วยเจริญพานิชก์",
            "ผศ.ดร.พรรณรัตน์ ก้วยเจริญพานิชก์",
            "ผศ.ดร.สาธิต กระเวนกิจ",
            "ผศ.ดร.กานดา ศรอินทร",
            "ผศ.ดร.เทวัญ เริ่มสูงเนิน",
            "ผศ.ดร.วัลลภา วงศ์ศีลธรรม",
            "ผศ.ดร.วัลลภา วงศ์ศีลธรรม",
            "อ.ปโยธร อุระ",
            "อ.ปโยธร อุระ",
            "ผศ.ดร.อริยะ นามวงศ์",
            "ผศ.ดร.อริยะ นามวงศ์",
            "อ.ดร.สุกัลญา ศิริมาตร์",
            "อ.ธนภัทร วงษ์คำจันทร์",
            "อ.ธนภัทร วงษ์คำจันทร์",
            "ผศ.ดร.ศรัญญา กัลย์จาฤก"

        )

        userArrayList = ArrayList()
        for(i in name.indices){
            val user = User(name[i],StudentID[i],no_class[i],phoneNo[i],country[i], university[i], advisor[i],imageId[i])
            userArrayList.add(user)

        }

        binding.listview.isClickable = true
        binding.listview.adapter = MyAdapter(this,userArrayList)
        binding.listview.setOnItemClickListener { parent, view, position, id ->

            val name = name[position]
            val phone = phoneNo[position]
            val country = country[position]
            val university = university[position]
            val advisor = advisor[position]
            val imageId = imageId[position]

            val i =  Intent(this,UserActivity::class.java)
            i.putExtra("name",name)
            i.putExtra("phone",phone)
            i.putExtra("country",country)
            i.putExtra("university",university)
            i.putExtra("advisor",advisor)
            i.putExtra("imageId",imageId)
            startActivity(i)



        }

        FirebaseAuth.getInstance().signOut();

    }
}