package th.ac.kku.cis.mobileapp.cislist

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(private val context : Activity,private  val arraylist : ArrayList<User>) : ArrayAdapter<User>(context,
                R.layout.list_item,arraylist) {



    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View{


        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.list_item,null)

        val imageView : ImageView = view.findViewById(R.id.profie_pic)
        val username : TextView = view.findViewById(R.id.personName)
        val studentid : TextView = view.findViewById(R.id.StudentID)
        val noclass : TextView = view.findViewById(R.id.no_class)

        imageView.setImageResource(arraylist[position].imageId)
        username.text = arraylist[position].name
        studentid.text= arraylist[position].StudentID
        noclass.text = arraylist[position].no_class




        return view
    }
}