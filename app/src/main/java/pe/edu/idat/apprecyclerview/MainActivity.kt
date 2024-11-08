package pe.edu.idat.apprecyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import pe.edu.idat.apprecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvalumnos.layoutManager =
            LinearLayoutManager(applicationContext)
        binding.rvalumnos.adapter = RecyclerAdapter(listaDeAlumnos())
    }

    private fun listaDeAlumnos():List<String>{
        var listaAlumnos = ArrayList<String>()
        listaAlumnos.add("Rodriguez Mendoza")
        listaAlumnos.add("Julca Palomino")
        listaAlumnos.add("Chulluncuy Messi")
        listaAlumnos.add("Ramirez Nayeli")
        listaAlumnos.add("Orbegoso Julio")
        listaAlumnos.add("Anyosa Jessica")
        listaAlumnos.add("Morales Gomez")
        return listaAlumnos
    }
}