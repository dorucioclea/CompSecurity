.class public Lcom/facebook/orca/broadcast/r;
.super Ljava/lang/Object;
.source "IsBroadcastEnabledProvider.java"

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
.field private static final a:Lcom/facebook/prefs/shared/ae;


# instance fields
.field private final b:Lcom/facebook/prefs/shared/d;

.field private final c:Lcom/facebook/config/a/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 17
    const-string v0, "messenger_broadcast_android"

    invoke-static {v0}, Lcom/facebook/f/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/broadcast/r;->a:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/config/a/d;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/facebook/orca/broadcast/r;->b:Lcom/facebook/prefs/shared/d;

    .line 28
    iput-object p2, p0, Lcom/facebook/orca/broadcast/r;->c:Lcom/facebook/config/a/d;

    .line 29
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 33
    iget-object v1, p0, Lcom/facebook/orca/broadcast/r;->c:Lcom/facebook/config/a/d;

    sget-object v2, Lcom/facebook/config/a/d;->MESSENGER:Lcom/facebook/config/a/d;

    if-eq v1, v2, :cond_0

    iget-object v1, p0, Lcom/facebook/orca/broadcast/r;->c:Lcom/facebook/config/a/d;

    sget-object v2, Lcom/facebook/config/a/d;->FB4A:Lcom/facebook/config/a/d;

    if-ne v1, v2, :cond_1

    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/broadcast/r;->b:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/orca/broadcast/r;->a:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    :cond_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 16
    invoke-virtual {p0}, Lcom/facebook/orca/broadcast/r;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
