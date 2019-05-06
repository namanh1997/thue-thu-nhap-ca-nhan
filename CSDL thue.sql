CREATE DATABASE `thue`;
CREATE TABLE `thue`.`tbl_user` (
  `cmnd` VARCHAR(255) NOT NULL,
  `mat_khau` VARCHAR(255) NOT NULL,
  `ho_ten` VARCHAR(255) NULL DEFAULT NULL,
  `ngay_sinh` DATE NULL DEFAULT NULL,
  `so_thang_hop_dong_lao_dong` MEDIUMTEXT NULL DEFAULT NULL,
  `luong` MEDIUMTEXT NULL DEFAULT NULL,
  `thuong` MEDIUMTEXT NULL DEFAULT NULL,
  `dinh_muc_thuong` MEDIUMTEXT NULL DEFAULT NULL,
  `lam_them` MEDIUMTEXT NULL DEFAULT NULL,
  `dinh_muc_lam_them` MEDIUMTEXT NULL DEFAULT NULL,
  `phu_cap_1` MEDIUMTEXT NULL DEFAULT NULL,
  `phu_cap_2` MEDIUMTEXT NULL DEFAULT NULL,
  `phu_cap_3` MEDIUMTEXT NULL DEFAULT NULL,
  `dinh_muc_phu_cap_3` MEDIUMTEXT NULL DEFAULT NULL,
  `phu_cap_4` MEDIUMTEXT NULL DEFAULT NULL,
  `dinh_muc_phu_cap_4` MEDIUMTEXT NULL DEFAULT NULL,
  `so_nguoi_phu_thuoc` MEDIUMTEXT NULL DEFAULT NULL,
  PRIMARY KEY (`cmnd`),
  UNIQUE INDEX `idtbl_user_UNIQUE` (`cmnd` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;
