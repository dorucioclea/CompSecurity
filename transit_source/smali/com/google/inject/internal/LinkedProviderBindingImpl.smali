.class final Lcom/google/inject/internal/LinkedProviderBindingImpl;
.super Lcom/google/inject/internal/BindingImpl;
.source "LinkedProviderBindingImpl.java"

# interfaces
.implements Lcom/google/inject/spi/ProviderKeyBinding;
.implements Lcom/google/inject/spi/HasDependencies;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/inject/internal/BindingImpl",
        "<TT;>;",
        "Lcom/google/inject/spi/ProviderKeyBinding",
        "<TT;>;",
        "Lcom/google/inject/spi/HasDependencies;"
    }
.end annotation


# instance fields
.field final providerKey:Lcom/google/inject/Key;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/Key",
            "<+",
            "Ljavax/inject/Provider",
            "<+TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Key;Ljava/lang/Object;Lcom/google/inject/internal/InternalFactory;Lcom/google/inject/internal/Scoping;Lcom/google/inject/Key;)V
    .locals 0
    .param p1, "injector"    # Lcom/google/inject/internal/InjectorImpl;
    .param p3, "source"    # Ljava/lang/Object;
    .param p5, "scoping"    # Lcom/google/inject/internal/Scoping;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/InjectorImpl;",
            "Lcom/google/inject/Key",
            "<TT;>;",
            "Ljava/lang/Object;",
            "Lcom/google/inject/internal/InternalFactory",
            "<+TT;>;",
            "Lcom/google/inject/internal/Scoping;",
            "Lcom/google/inject/Key",
            "<+",
            "Ljavax/inject/Provider",
            "<+TT;>;>;)V"
        }
    .end annotation

    .prologue
    .line 38
    .local p0, "this":Lcom/google/inject/internal/LinkedProviderBindingImpl;, "Lcom/google/inject/internal/LinkedProviderBindingImpl<TT;>;"
    .local p2, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    .local p4, "internalFactory":Lcom/google/inject/internal/InternalFactory;, "Lcom/google/inject/internal/InternalFactory<+TT;>;"
    .local p6, "providerKey":Lcom/google/inject/Key;, "Lcom/google/inject/Key<+Ljavax/inject/Provider<+TT;>;>;"
    invoke-direct/range {p0 .. p5}, Lcom/google/inject/internal/BindingImpl;-><init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Key;Ljava/lang/Object;Lcom/google/inject/internal/InternalFactory;Lcom/google/inject/internal/Scoping;)V

    .line 39
    iput-object p6, p0, Lcom/google/inject/internal/LinkedProviderBindingImpl;->providerKey:Lcom/google/inject/Key;

    .line 40
    return-void
.end method

.method constructor <init>(Ljava/lang/Object;Lcom/google/inject/Key;Lcom/google/inject/internal/Scoping;Lcom/google/inject/Key;)V
    .locals 0
    .param p1, "source"    # Ljava/lang/Object;
    .param p3, "scoping"    # Lcom/google/inject/internal/Scoping;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lcom/google/inject/Key",
            "<TT;>;",
            "Lcom/google/inject/internal/Scoping;",
            "Lcom/google/inject/Key",
            "<+",
            "Ljavax/inject/Provider",
            "<+TT;>;>;)V"
        }
    .end annotation

    .prologue
    .line 44
    .local p0, "this":Lcom/google/inject/internal/LinkedProviderBindingImpl;, "Lcom/google/inject/internal/LinkedProviderBindingImpl<TT;>;"
    .local p2, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    .local p4, "providerKey":Lcom/google/inject/Key;, "Lcom/google/inject/Key<+Ljavax/inject/Provider<+TT;>;>;"
    invoke-direct {p0, p1, p2, p3}, Lcom/google/inject/internal/BindingImpl;-><init>(Ljava/lang/Object;Lcom/google/inject/Key;Lcom/google/inject/internal/Scoping;)V

    .line 45
    iput-object p4, p0, Lcom/google/inject/internal/LinkedProviderBindingImpl;->providerKey:Lcom/google/inject/Key;

    .line 46
    return-void
.end method


# virtual methods
.method public acceptTargetVisitor(Lcom/google/inject/spi/BindingTargetVisitor;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/spi/BindingTargetVisitor",
            "<-TT;TV;>;)TV;"
        }
    .end annotation

    .prologue
    .line 49
    .local p0, "this":Lcom/google/inject/internal/LinkedProviderBindingImpl;, "Lcom/google/inject/internal/LinkedProviderBindingImpl<TT;>;"
    .local p1, "visitor":Lcom/google/inject/spi/BindingTargetVisitor;, "Lcom/google/inject/spi/BindingTargetVisitor<-TT;TV;>;"
    invoke-interface {p1, p0}, Lcom/google/inject/spi/BindingTargetVisitor;->visit(Lcom/google/inject/spi/ProviderKeyBinding;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public applyTo(Lcom/google/inject/Binder;)V
    .locals 3
    .param p1, "binder"    # Lcom/google/inject/Binder;

    .prologue
    .line 69
    .local p0, "this":Lcom/google/inject/internal/LinkedProviderBindingImpl;, "Lcom/google/inject/internal/LinkedProviderBindingImpl<TT;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/LinkedProviderBindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/inject/internal/LinkedProviderBindingImpl;->getSource()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/google/inject/Binder;->withSource(Ljava/lang/Object;)Lcom/google/inject/Binder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/inject/internal/LinkedProviderBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/google/inject/Binder;->bind(Lcom/google/inject/Key;)Lcom/google/inject/binder/LinkedBindingBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/inject/internal/LinkedProviderBindingImpl;->getProviderKey()Lcom/google/inject/Key;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/google/inject/binder/LinkedBindingBuilder;->toProvider(Lcom/google/inject/Key;)Lcom/google/inject/binder/ScopedBindingBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/inject/internal/Scoping;->applyTo(Lcom/google/inject/binder/ScopedBindingBuilder;)V

    .line 71
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    .local p0, "this":Lcom/google/inject/internal/LinkedProviderBindingImpl;, "Lcom/google/inject/internal/LinkedProviderBindingImpl<TT;>;"
    const/4 v1, 0x0

    .line 84
    instance-of v2, p1, Lcom/google/inject/internal/LinkedProviderBindingImpl;

    if-eqz v2, :cond_0

    move-object v0, p1

    .line 85
    check-cast v0, Lcom/google/inject/internal/LinkedProviderBindingImpl;

    .line 86
    .local v0, "o":Lcom/google/inject/internal/LinkedProviderBindingImpl;, "Lcom/google/inject/internal/LinkedProviderBindingImpl<*>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/LinkedProviderBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/inject/internal/LinkedProviderBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/inject/Key;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/google/inject/internal/LinkedProviderBindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/inject/internal/LinkedProviderBindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/inject/internal/Scoping;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/inject/internal/LinkedProviderBindingImpl;->providerKey:Lcom/google/inject/Key;

    iget-object v3, v0, Lcom/google/inject/internal/LinkedProviderBindingImpl;->providerKey:Lcom/google/inject/Key;

    invoke-static {v2, v3}, Lcom/google/inject/internal/util/$Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x1

    .line 90
    .end local v0    # "o":Lcom/google/inject/internal/LinkedProviderBindingImpl;, "Lcom/google/inject/internal/LinkedProviderBindingImpl<*>;"
    :cond_0
    return v1
.end method

.method public getDependencies()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/spi/Dependency",
            "<*>;>;"
        }
    .end annotation

    .prologue
    .line 57
    .local p0, "this":Lcom/google/inject/internal/LinkedProviderBindingImpl;, "Lcom/google/inject/internal/LinkedProviderBindingImpl<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/LinkedProviderBindingImpl;->providerKey:Lcom/google/inject/Key;

    invoke-static {v0}, Lcom/google/inject/spi/Dependency;->get(Lcom/google/inject/Key;)Lcom/google/inject/spi/Dependency;

    move-result-object v0

    invoke-static {v0}, Lcom/google/inject/internal/util/$ImmutableSet;->of(Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    return-object v0
.end method

.method public getProviderKey()Lcom/google/inject/Key;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/Key",
            "<+",
            "Ljavax/inject/Provider",
            "<+TT;>;>;"
        }
    .end annotation

    .prologue
    .line 53
    .local p0, "this":Lcom/google/inject/internal/LinkedProviderBindingImpl;, "Lcom/google/inject/internal/LinkedProviderBindingImpl<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/LinkedProviderBindingImpl;->providerKey:Lcom/google/inject/Key;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 96
    .local p0, "this":Lcom/google/inject/internal/LinkedProviderBindingImpl;, "Lcom/google/inject/internal/LinkedProviderBindingImpl<TT;>;"
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/inject/internal/LinkedProviderBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/google/inject/internal/LinkedProviderBindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/inject/internal/LinkedProviderBindingImpl;->providerKey:Lcom/google/inject/Key;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/inject/internal/util/$Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 74
    .local p0, "this":Lcom/google/inject/internal/LinkedProviderBindingImpl;, "Lcom/google/inject/internal/LinkedProviderBindingImpl<TT;>;"
    new-instance v0, Lcom/google/inject/internal/util/$ToStringBuilder;

    const-class v1, Lcom/google/inject/spi/ProviderKeyBinding;

    invoke-direct {v0, v1}, Lcom/google/inject/internal/util/$ToStringBuilder;-><init>(Ljava/lang/Class;)V

    const-string v1, "key"

    invoke-virtual {p0}, Lcom/google/inject/internal/LinkedProviderBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ToStringBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ToStringBuilder;

    move-result-object v0

    const-string v1, "source"

    invoke-virtual {p0}, Lcom/google/inject/internal/LinkedProviderBindingImpl;->getSource()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ToStringBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ToStringBuilder;

    move-result-object v0

    const-string v1, "scope"

    invoke-virtual {p0}, Lcom/google/inject/internal/LinkedProviderBindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ToStringBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ToStringBuilder;

    move-result-object v0

    const-string v1, "provider"

    iget-object v2, p0, Lcom/google/inject/internal/LinkedProviderBindingImpl;->providerKey:Lcom/google/inject/Key;

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ToStringBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ToStringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/inject/internal/util/$ToStringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public withKey(Lcom/google/inject/Key;)Lcom/google/inject/internal/BindingImpl;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Key",
            "<TT;>;)",
            "Lcom/google/inject/internal/BindingImpl",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 65
    .local p0, "this":Lcom/google/inject/internal/LinkedProviderBindingImpl;, "Lcom/google/inject/internal/LinkedProviderBindingImpl<TT;>;"
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    new-instance v0, Lcom/google/inject/internal/LinkedProviderBindingImpl;

    invoke-virtual {p0}, Lcom/google/inject/internal/LinkedProviderBindingImpl;->getSource()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/inject/internal/LinkedProviderBindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v2

    iget-object v3, p0, Lcom/google/inject/internal/LinkedProviderBindingImpl;->providerKey:Lcom/google/inject/Key;

    invoke-direct {v0, v1, p1, v2, v3}, Lcom/google/inject/internal/LinkedProviderBindingImpl;-><init>(Ljava/lang/Object;Lcom/google/inject/Key;Lcom/google/inject/internal/Scoping;Lcom/google/inject/Key;)V

    return-object v0
.end method

.method public withScoping(Lcom/google/inject/internal/Scoping;)Lcom/google/inject/internal/BindingImpl;
    .locals 4
    .param p1, "scoping"    # Lcom/google/inject/internal/Scoping;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/Scoping;",
            ")",
            "Lcom/google/inject/internal/BindingImpl",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 61
    .local p0, "this":Lcom/google/inject/internal/LinkedProviderBindingImpl;, "Lcom/google/inject/internal/LinkedProviderBindingImpl<TT;>;"
    new-instance v0, Lcom/google/inject/internal/LinkedProviderBindingImpl;

    invoke-virtual {p0}, Lcom/google/inject/internal/LinkedProviderBindingImpl;->getSource()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/inject/internal/LinkedProviderBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v2

    iget-object v3, p0, Lcom/google/inject/internal/LinkedProviderBindingImpl;->providerKey:Lcom/google/inject/Key;

    invoke-direct {v0, v1, v2, p1, v3}, Lcom/google/inject/internal/LinkedProviderBindingImpl;-><init>(Ljava/lang/Object;Lcom/google/inject/Key;Lcom/google/inject/internal/Scoping;Lcom/google/inject/Key;)V

    return-object v0
.end method
