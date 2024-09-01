package miracleblog.domain._core.error;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import miracleblog.domain._core.error.exception.Exception404;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class MiracleExceptionHandler {

    @ExceptionHandler(Exception404.class)
    public String ex404(Exception404 e, HttpServletRequest request) {
        request.setAttribute("msg", e.getMessage());
        request.setAttribute("errorCode", 404);
        log.info("404 : " + e.getMessage());
        return "err/err";
    }
}
