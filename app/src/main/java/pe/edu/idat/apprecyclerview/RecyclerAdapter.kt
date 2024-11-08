package pe.edu.idat.apprecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pe.edu.idat.apprecyclerview.databinding.ItemAlumnoBinding

class RecyclerAdapter(private var listaAlumnos: List<String>)
    : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemAlumnoBinding):
        RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val binding = ItemAlumnoBinding
            .inflate(LayoutInflater.from(parent.context),
                parent, false)
        return ViewHolder(binding)
    }
    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        with(holder){
            binding.tvnomalumno.text = listaAlumnos[position]
        }
    }
    override fun getItemCount(): Int = listaAlumnos.size
}