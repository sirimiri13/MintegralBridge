//
//  ShowMintegral.m
//  BridgeMintegral
//
//  Created by Hương Lâm Quỳnh on 06/01/2022.
//

#import "Mintegral.h"


@interface Mintegral ()<MTGBannerAdViewDelegate>

@property (nonatomic, strong) MTGBannerAdView *bannerAdView;
@end
@implementation Mintegral


- (UIViewController*) topMostController
{
    UIViewController *topController = [UIApplication sharedApplication].keyWindow.rootViewController;

    while (topController.presentedViewController) {
        topController = topController.presentedViewController;
    }

    return topController;
}


- (void) showAds{
  UIViewController *topMostViewControllerObj = [self topMostController];

  if (_bannerAdView == nil) {
      _bannerAdView = [[MTGBannerAdView alloc]initBannerAdViewWithAdSize:CGSizeMake(100, 50) placementId:@"399737" unitId:@"1675816" rootViewController:topMostViewControllerObj];
  _bannerAdView.frame = CGRectMake(10, 300, 345,50);
  _bannerAdView.delegate = self;
      _bannerAdView.autoRefreshTime = 3;//Automatic refresh time, in seconds, is set in the range of 10s~180s.If set to 0, it will not be automatically refreshed.
      _bannerAdView.showCloseButton = true;
      _bannerAdView.delegate = self;
      [topMostViewControllerObj.view addSubview:_bannerAdView];
      [_bannerAdView loadBannerAd];

  }
}

- (void)adViewCloseFullScreen:(MTGBannerAdView *)adView {
  NSLog(@"adViewCloseFullScreen");
}

- (void)adViewClosed:(MTGBannerAdView *)adView {
  NSLog(@"adViewClosed");

}

- (void)adViewDidClicked:(MTGBannerAdView *)adView {
  NSLog(@"adViewDidClicked");

}

- (void)adViewLoadFailedWithError:(NSError *)error adView:(MTGBannerAdView *)adView {
  NSLog(@"adViewLoadFailedWithError");

}

- (void)adViewLoadSuccess:(MTGBannerAdView *)adView {
  NSLog(@"adViewLoadSuccess");

}

- (void)adViewWillLeaveApplication:(MTGBannerAdView *)adView {
  NSLog(@"adViewWillLeaveApplication");

}

- (void)adViewWillLogImpression:(MTGBannerAdView *)adView {
  NSLog(@"adViewWillLogImpression");

}

- (void)adViewWillOpenFullScreen:(MTGBannerAdView *)adView {
  NSLog(@"adViewWillOpenFullScreen");

}

@end
