//
//  Mintegral.swift
//  BridgeMintegral
//
//  Created by Hương Lâm Quỳnh on 06/01/2022.
//

import Foundation
import UIKit



@objc(MintegralIOS)
class MintegralIOS :NSObject, RCTBridgeModule {
  
  var ads = Mintegral()
  
  static func moduleName() -> String! {
    return "Mintegral"
  }
  
  static func requiresMainQueueSetup () -> Bool {
     return true;
   }
   
  
  @objc
  func addAds() -> Void{
    print("add ads swift")
    DispatchQueue.main.async { [self] in
      ads.showAds()
    }
  }

}
