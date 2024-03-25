package hei.school.soratra.endpoint.rest.controller.health;

import hei.school.soratra.PojaGenerated;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@PojaGenerated
public class SoratraController {

    @PutMapping("/soratra/{id}")
    public ResponseEntity<?> putSoratra(
            @PathVariable("id") int id,
            @RequestBody PoeticPhraseRequest request) {

        return ResponseEntity.ok().build();
    }
    static class PoeticPhraseRequest {
        private String phrase_poetique;

        public String getPhrase_poetique() {
            return phrase_poetique;
        }

        public void setPhrase_poetique(String phrase_poetique) {
            this.phrase_poetique = phrase_poetique.toLowerCase(Locale.ROOT);
        }
    }
}
