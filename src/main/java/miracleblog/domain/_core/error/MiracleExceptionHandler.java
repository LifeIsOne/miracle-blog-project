package miracleblog.domain._core.error;

import lombok.extern.slf4j.Slf4j;
import miracleblog.domain._core.error.exception.Exception404;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class MiracleExceptionHandler {

    @ExceptionHandler(Exception404.class)
    public String ex404(Exception404 e) {
        return "err/err";
    }
}
