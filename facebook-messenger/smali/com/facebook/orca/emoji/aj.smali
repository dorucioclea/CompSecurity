.class public Lcom/facebook/orca/emoji/aj;
.super Ljava/lang/Object;
.source "IsEmojiAttachmentPopupEnabledProvider.java"

# interfaces
.implements Ljavax/inject/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/a",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/facebook/prefs/shared/ae;


# instance fields
.field private final b:Lcom/facebook/prefs/shared/d;

.field private final c:Lcom/facebook/config/a/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 18
    const-string v0, "messenger_emoji_composer_android"

    invoke-static {v0}, Lcom/facebook/f/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/emoji/aj;->a:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/config/a/a;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/facebook/orca/emoji/aj;->b:Lcom/facebook/prefs/shared/d;

    .line 29
    iput-object p2, p0, Lcom/facebook/orca/emoji/aj;->c:Lcom/facebook/config/a/a;

    .line 30
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 3

    .prologue
    .line 34
    iget-object v0, p0, Lcom/facebook/orca/emoji/aj;->b:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/emoji/aj;->a:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 16
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/aj;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
