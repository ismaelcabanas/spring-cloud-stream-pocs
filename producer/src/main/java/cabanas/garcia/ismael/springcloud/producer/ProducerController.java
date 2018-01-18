package cabanas.garcia.ismael.springcloud.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableBinding(Source.class)
@RestController
@RequestMapping(value = "/demo")
public class ProducerController {

    @Autowired
    Source mysource;

    @PostMapping
    public ResponseEntity<Void> demo(@RequestBody String payload) {

        mysource.output().send(MessageBuilder.withPayload(payload).build());

        return ResponseEntity.ok().build();
    }
}
