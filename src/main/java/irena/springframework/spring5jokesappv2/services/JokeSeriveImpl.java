package irena.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeSeriveImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeSeriveImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return null;
    }
}
