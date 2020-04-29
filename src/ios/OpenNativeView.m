/********* IMPlugin.m Cordova Plugin Implementation *******/

#import <Cordova/CDV.h>

#import "OpenNativeView.h"
#import <AVFoundation/AVFoundation.h>
#import "ViewController.h"


@implementation OpenNativeView

static CDVInvokedUrlCommand *initcommand;


-(void)open:(CDVInvokedUrlCommand *)command
{

    // NSString* type = [command.arguments objectAtIndex:0];
    NSString* url = [command.arguments objectAtIndex:1];

    // 弹出视频界面
//    OpenUrlViewController * vvc = [[OpenUrlViewController alloc]initWithUrl:url];
//    [self.viewController presentViewController:vvc animated:YES completion:nil];
    
    
    
    
    if ([url containsString:@"MERCHANTID"]&&[url containsString:@"POSID"]) {
        ViewController *myView = [[ViewController alloc]init];
        myView.urlString = url;
        //        [self.navigationController pushViewController:myView animated:YES];
        
        
        [self.viewController presentViewController:myView animated:YES completion:nil];
        
//        [self presentViewController:myView animated:YES completion:^{
//        }];
//        decisionHandler(WKNavigationActionPolicyCancel);
        return;
    }
}



@end
