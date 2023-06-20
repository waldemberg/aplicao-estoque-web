package org.github.waldemberg.estoqueapp.anotacao;

import org.springframework.security.access.prepost.PreAuthorize;

@PreAuthorize("hasAuthority('ler_usuarios')")
public @interface LerUsuarios {
}
