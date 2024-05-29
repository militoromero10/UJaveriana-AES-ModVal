package com.patrones.convenios;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class XmlTransformController {

    private final TransformXml transformXml;

    public XmlTransformController(TransformXml transformXml) {
        this.transformXml = transformXml;
    }

    @GetMapping("/transformResultadoConsulta")
    public ResponseEntity<String> transformResultadoConsulta() throws Exception {
        return ResponseEntity.ok(transformXml.transform("ResultadoConsulta.xml", "transformResultadoConsulta.xslt"));
    }

    @GetMapping("/transformReferenciaFactura")
    public ResponseEntity<String> transformReferenciaFactura() throws Exception {
        return ResponseEntity.ok(transformXml.transform("ReferenciaFactura.xml", "transformReferenciaFactura.xslt"));
    }

    @GetMapping("/transformPago")
    public ResponseEntity<String> transformPago() throws Exception {
        return ResponseEntity.ok(transformXml.transform("Pago.xml", "transformPago.xslt"));
    }

    @GetMapping("/transformResultado")
    public ResponseEntity<String> transformResultado() throws Exception {
        return ResponseEntity.ok(transformXml.transform("Resultado.xml", "transformResultado.xslt"));
    }

    @ExceptionHandler({Exception.class})
    public ResponseEntity<String> handleException(Exception e) {
        return ResponseEntity.status(500).body("Error transforming XML: " + e.getMessage());
    }

}
