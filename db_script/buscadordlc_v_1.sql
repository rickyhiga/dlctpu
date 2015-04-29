-- MySQL Script generated by MySQL Workbench
-- 04/26/15 18:29:20
-- Model: New Model    Version: 1.0
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema buscadordlc
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `buscadordlc` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `buscadordlc` ;

-- -----------------------------------------------------
-- Table `buscadordlc`.`vocabulario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `buscadordlc`.`vocabulario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `termino` VARCHAR(30) NULL,
  `cant_doc` INT NULL,
  `max_tf` INT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `buscadordlc`.`documentos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `buscadordlc`.`documentos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `url` VARCHAR(75) NULL,
  `modulo_dol` VARCHAR(75) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `buscadordlc`.`posteo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `buscadordlc`.`posteo` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `vocabulario_id` INT NOT NULL,
  `documento_id` INT NOT NULL,
  `cant_apariciones_tf` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_posteo_vocabulario_idx` (`vocabulario_id` ASC),
  INDEX `fk_posteo_documentos1_idx` (`documento_id` ASC),
  CONSTRAINT `fk_posteo_vocabulario`
    FOREIGN KEY (`vocabulario_id`)
    REFERENCES `buscadordlc`.`vocabulario` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_posteo_documentos1`
    FOREIGN KEY (`documento_id`)
    REFERENCES `buscadordlc`.`documentos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;