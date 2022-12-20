package odilo.recruitment.firmaJuridica.controller;

import lombok.RequiredArgsConstructor;
import odilo.recruitment.firmaJuridica.FirmaJuridicaApplication;
import odilo.recruitment.firmaJuridica.service.FirmaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;


@RestController
@RequestMapping("/firma")
@RequiredArgsConstructor
public class firmaController {

    private final FirmaService service;
    private static final Logger log = LoggerFactory.getLogger(FirmaJuridicaApplication.class);

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> firmar(){
        log.info(service.findAll().toString());
        return new ResponseEntity<>(service.findAll().toString(),HttpStatus.OK);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    public String handleFileUpload(@RequestParam("file") MultipartFile file,
                                   RedirectAttributes redirectAttributes) throws IOException {
        service.store(file, Long.parseLong("1"));
        redirectAttributes.addFlashAttribute("message",
                "You successfully uploaded " + file.getOriginalFilename() + "!");

        return "redirect:/usuario";
    }


}
