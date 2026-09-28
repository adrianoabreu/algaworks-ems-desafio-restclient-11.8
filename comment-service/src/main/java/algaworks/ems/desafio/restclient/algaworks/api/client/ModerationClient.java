package algaworks.ems.desafio.restclient.algaworks.api.client;

import algaworks.ems.desafio.restclient.algaworks.api.model.ModerationRequest;
import algaworks.ems.desafio.restclient.algaworks.api.model.ModerationRequest;
import algaworks.ems.desafio.restclient.algaworks.api.model.ModerationResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.PostExchange;


public interface ModerationClient {
        @PostExchange("/api/moderate")
        ModerationResponse moderateComment(@RequestBody ModerationRequest request);

}
