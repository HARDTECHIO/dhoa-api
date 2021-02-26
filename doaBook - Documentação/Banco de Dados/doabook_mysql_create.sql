CREATE TABLE `postagens` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`texto` TEXT(2000) NOT NULL,
	`imagem_url` varchar(255),
	`contato_url` varchar(255) NOT NULL,
	`data_postagem` DATE NOT NULL,
	`usuario_id` INT NOT NULL,
	`tema_id` INT NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `temas` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`nome` varchar(50) NOT NULL,
	`descricao` varchar(255),
	`icone` varchar(255),
	PRIMARY KEY (`id`)
);

CREATE TABLE `usuarios` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`nome` varchar(100) NOT NULL,
	`email` varchar(100) NOT NULL,
	`senha` varchar(100) NOT NULL,
	`img_url` varchar(100),
	PRIMARY KEY (`id`)
);

ALTER TABLE `postagens` ADD CONSTRAINT `postagens_fk0` FOREIGN KEY (`usuario_id`) REFERENCES `usuarios`(`id`);

ALTER TABLE `postagens` ADD CONSTRAINT `postagens_fk1` FOREIGN KEY (`tema_id`) REFERENCES `temas`(`id`);

