package com.Semillero2023.Tarea2.wsint;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Semillero2023.Tarea2.entity.Bitacora;
import com.Semillero2023.Tarea2.entity.Carrera;
import com.Semillero2023.Tarea2.entity.Estudiante;
import com.Semillero2023.Tarea2.entity.Factura;
import com.Semillero2023.Tarea2.entity.Usuario;

@CrossOrigin
@RestController
@RequestMapping("/servicio")
public interface ServicioTarea2Int {
	
	@GetMapping("/")
	public String test();
	
	@GetMapping("/getBitacora")
	public List<Bitacora> getBitacora();
	
	@PostMapping("/postBitacora")
	public Bitacora postBitacora(@RequestBody Bitacora bitacora);
	
	@GetMapping("/getUsuario")
	public List<Usuario> getUsuario();
	
	@PostMapping("/postUsuario")
	public Usuario postUsuario(@RequestBody Usuario usuario);
	
	@GetMapping("/getFactura")
	public List<Factura> getFactura();
	
	@PostMapping("/postFactura")
	public Factura postFactura(@RequestBody Factura factura);
	
	@GetMapping("/getCarrera")
	public List<Carrera> getCarrera();
	
	@PostMapping("/postCarrera")
	public Carrera postCarrera(@RequestBody Carrera carrera);
	
	@GetMapping("/getEstudiante")
	public List<Estudiante> getEstudiante();
	
	@PostMapping("/postEstudiante")
	public Estudiante postEstudiante(@RequestBody Estudiante estudiante);
	
	@DeleteMapping("/deleteBitacora/{idBitacora}")
	public ResponseEntity<String> deleteBitacora(@PathVariable("idBitacora") Integer idBitacora);
	
	@DeleteMapping("/deleteUsuario/{idUsuario}")
	public ResponseEntity<String> deleteUsuario(@PathVariable("idUsuario") Integer idUsuario);
	
	@DeleteMapping("/deleteFactura/{idFactura}")
	public ResponseEntity<String> deleteFactura(@PathVariable("idFactura") Integer idFactura);
	
	@DeleteMapping("/deleteCarrera/{idCarrera}")
	public ResponseEntity<String> deleteCarrera(@PathVariable("idCarrera") Integer idCarrera);
	
	@DeleteMapping("/deleteEstudiante/{idEstudiante}")
	public ResponseEntity<String> deleteEstudiante(@PathVariable("idEstudiante") Integer idEstudiante);
	
}
