package mx.edu.utez.datoshttp.controller;

import mx.edu.utez.datoshttp.dto.ContactRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ContactController {

    @GetMapping("/info")
    public ResponseEntity<String> info() {
        return ResponseEntity.ok("API funcionando correctamente.");
    }

    @PostMapping("/contact")
    public ResponseEntity<String> contact(@RequestBody ContactRequest body) {
        if (body.getName() == null || body.getMessage() == null) {
            return ResponseEntity.badRequest().body("Faltan datos obligatorios.");
        }
        return ResponseEntity.status(201)
                .body("Mensaje recibido de " + body.getName() + ": " + body.getMessage());
    }
}
