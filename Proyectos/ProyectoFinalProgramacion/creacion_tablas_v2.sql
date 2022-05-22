-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema prog2122
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema prog2122
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `prog2122` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `prog2122` ;

-- -----------------------------------------------------
-- Table `prog2122`.`tutores`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `prog2122`.`tutores` (
  `codTutor` INT UNSIGNED NOT NULL,
  `nomTutor` VARCHAR(50) NOT NULL,
  `ape1Tutor` VARCHAR(50) NOT NULL,
  `ape2Tutor` VARCHAR(50) NULL DEFAULT NULL,
  `direccion` VARCHAR(100) NULL DEFAULT NULL,
  `email` VARCHAR(100) NULL DEFAULT NULL,
  `tel` CHAR(12) NULL DEFAULT NULL,
  PRIMARY KEY (`codTutor`),
  UNIQUE INDEX `tel` (`tel` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `prog2122`.`alumnado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `prog2122`.`alumnado` (
  `codAlumnado` INT UNSIGNED NOT NULL,
  `nombreAlumnado` VARCHAR(50) NULL DEFAULT NULL,
  `ape1Alumnado` VARCHAR(20) NULL DEFAULT NULL,
  `ape2Alumnado` VARCHAR(20) NULL DEFAULT NULL,
  `direccion` VARCHAR(60) NULL DEFAULT NULL,
  `codpostal` CHAR(5) NULL DEFAULT NULL,
  `provincia` VARCHAR(10) NULL DEFAULT NULL,
  `alergias` TINYINT(1) NULL DEFAULT NULL,
  `desAlergias` VARCHAR(50) NULL DEFAULT NULL,
  `codTutor` INT UNSIGNED NULL DEFAULT NULL,
  PRIMARY KEY (`codAlumnado`),
  INDEX `fk_alumnado_tutores` (`codTutor` ASC) VISIBLE,
  CONSTRAINT `fk_alumnado_tutores`
    FOREIGN KEY (`codTutor`)
    REFERENCES `prog2122`.`tutores` (`codTutor`)
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `prog2122`.`unidades`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `prog2122`.`unidades` (
  `codUnidad` INT UNSIGNED NOT NULL,
  `numMaxAlum` CHAR(4) NULL DEFAULT NULL,
  `tutoria` VARCHAR(50) NULL DEFAULT NULL,
  `tutores_codTutor` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`codUnidad`),
  INDEX `fk_unidades_tutores1_idx` (`tutores_codTutor` ASC) VISIBLE,
  CONSTRAINT `fk_unidades_tutores1`
    FOREIGN KEY (`tutores_codTutor`)
    REFERENCES `prog2122`.`tutores` (`codTutor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
