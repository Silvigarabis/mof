package me.silvigarabis.modmof;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mof implements ModInitializer {
   public static final String MOD_ID = "sil_mof";
   public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

   @Override
   public void onInitialize(){
      LOGGER.info("we just initiated Mofmod");
   }
}