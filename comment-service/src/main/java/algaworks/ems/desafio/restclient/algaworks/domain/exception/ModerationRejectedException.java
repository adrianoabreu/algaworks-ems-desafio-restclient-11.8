package algaworks.ems.desafio.restclient.algaworks.domain.exception;

public class ModerationRejectedException extends RuntimeException {
    public ModerationRejectedException(String message) {
        super(message);
    }
}