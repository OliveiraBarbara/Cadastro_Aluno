/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execoes;

import java.io.IOException;

/**
 *
 * @author barbara
 */
public class ErroDeGravacaoException extends IOException {

    public ErroDeGravacaoException() {
        super("Erro de gravação");
    }
}
