package pe.edu.upeu.proyecto.controller;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/archivos")
public class ArchivosController {
	
	@PostMapping("/create")
	public ResponseEntity<?> createRequisito(@RequestParam("archivo") MultipartFile archivo,@RequestParam String nombre){
		Map<String, Object> response = new HashMap<>();
		Path rutaArchivo = null;
		String nombreArchivo = null;
		if(!archivo.isEmpty()) {
			nombreArchivo = UUID.randomUUID().toString()+"_"+archivo.getOriginalFilename().replace(" ", "");
			rutaArchivo = Paths.get(".//src//main//resources//upload//").resolve(nombreArchivo).toAbsolutePath();
		}
		try {
			Files.copy(archivo.getInputStream(), rutaArchivo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			response.put("mensaje", "Error al subir la imagen : " +nombreArchivo);
			response.put("error", e.getMessage().concat(":").concat(e.getCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		response.put("Recurso", 1);
		response.put("mensaje", "has subido correctamente las fotos " + nombreArchivo);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}
}